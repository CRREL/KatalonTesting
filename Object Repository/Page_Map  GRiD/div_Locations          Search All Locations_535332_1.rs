<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Locations          Search All Locations_535332_1</name>
   <tag></tag>
   <elementGuidId>92d5db24-0fb9-403b-b5b5-3de5dcf78aea</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#layertree-body-container</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='layertree-body-container']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>layertree-body-container</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      
  
    
      
        
          
        
        
          Locations
          Search All Locations
          Search Place Names
          Search Coordinates
          Search AOIs
          
          Data
          Search Collects
          
          Search Pointcloud Tiles
          Search Raster Tiles
          Search Mesh Tiles
          Search Vectors
          
        
      
      
      
    
    
    





.ui-menu{
  z-index:10001 !important;
}

.list-hr {
  margin-top:5px;
  margin-bottom:7px
}

.coordinate-input-container, .dropdown-menu-container{
  display:inline;
}

.modal-header{
  font-family: 'robotoregular';
}

.coordinate-input-small{
  width:40px;
  height:33px;
  margin:1px;
}

.coordinate-input{
  width:50px;
  height:33px;
  margin:1px;
}

.modal-header > h5{
  font-size: 18px;
}

.modal-header > h4{
  font-size: 22px;
}

.search-dropdown-input{
  height:32px !important;
  margin-top:-3px
}

li {
  cursor: pointer;
}

.ui-menu .ui-menu-item {
    position: relative;
    margin: 0;
    padding: 3px 1em 3px .4em;
    cursor: pointer;
    min-height: 0; /* support: IE7 */
    /* support: IE10, see #8844 */
    list-style-image: url(&quot;data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7&quot;);
}

.ui-widget-content .ui-state-active,
.ui-widget-header .ui-state-active {
    border: 1px solid #aaaaaa;
    background: #999999 50% 50% repeat-x;
    font-weight: normal;
    color: #212121;
}

.disabled-result .list-header {
  color:grey;
  pointer-events:none;
  cursor: default !important;
}

.list-header {
  margin-left:20px;
  font-size:14px;
}

.search-loader {
    position: absolute;
    z-index: 10005;
    top: 12px;
    left: 215px;
}



$('#search-loading').css('color','#fff');
$('#simplesearch').show();

var default_search_type = 'aois-locations-coordinate';

$('.search-type').on('click', function(){
  $('#map-search').prop('placeholder', $(this)[0].innerText);
  initSmartSearch($(this).data('type'));
})

$('#clear-search').on('click', function(){
  $('#map-search').val('');
  $('#reset-search').trigger('click');
$('#search-loading').css('color','#fff');
  search_preview_cleanup();
})


function search_preview_cleanup(){
  features = searchPreviewLayer.getSource().getFeatures()
  for (i=0; i&lt;features.length; i++){
    hexcolor = &quot;#&quot; + Math.random().toString(16).slice(2, 8);
    setFeatureColor(features[i], hexcolor, '0.0', '')
  }
}

var selected_search_result;

function initSmartSearch(type) {
  type = type || default_search_type;
  minLength=3;
  limit = 50;
  reset_type = false;
  if (type=='alist'){
    reset_type = true;
    $('#map-search').val('');
    minLength=0;
  }
      if ($('#map-search').autocomplete('instance') != undefined){
        $('#map-search').autocomplete('destroy');
      }
      $(&quot;#map-search&quot;).autocomplete({
      source: function( request, response ) {
        $('#search-loading').css('color','#555');
        $.ajax({
          url: &quot;/grid/map/smartsearch/&quot;,
          dataType: &quot;json&quot;,
          data: {
            query: request.term,
            limit: limit,
            type: type,
          },
          success: function( data ) {
            response(data);
          }
        });
      },
      autoFocus: true,
      minLength: minLength,
      select: function( event, ui ) {
        selected_search_result = ui.item.placeholder_name;
      if (ui.item.class != 'disabled-result'){
          if (ui.item.type == 'AOI') {
            // Can't search for temp AOIs, so set temp to false
            // to load correct geometry
            temp = false
            load_existing_aoi(ui.item.pk);
            return;
          }
          else {
            hideDisplayPane();
            search_preview_cleanup();
            getShape(ui.item, false, false, '', searchPreviewLayer);
          }
          var map = $('#map').data('map');
          var coordinate = [convertLon(ui.item.lon), ui.item.lat]
          var transform_coordinate = ol.proj.transform(coordinate, 'EPSG:4326', 'EPSG:3857');
          displayCoords = formatCoords(coordinate);
          add_coord_popup(transform_coordinate, ui.item.label + '&lt;br>' + displayCoords);
          var view = map.getView();
          if (ui.item.extent != null)
          {
            extent = ol.proj.transformExtent(ui.item.extent, 'EPSG:4326', 'EPSG:3857');
            map.getView().fit(extent, map.getSize());
            zoom_out = 0;
            if (ui.item.type == 'Coordinate'){
              zoom_out = 8
            }
            map.getView().setZoom(map.getView().getZoom()-zoom_out);
          }
          else
          {
            map.getView().setCenter(transform_coordinate);
          }
        }
      },
      open: function() {
        $('#search-loading').hide();
        $( this ).removeClass( &quot;ui-corner-all&quot; ).addClass( &quot;ui-corner-top&quot; );
      },
      close: function() {
        if (reset_type == true){
          initSmartSearch('aois');
        }
        $(this).empty();
        $('#search-loading').css('color','#fff');
        $('#map-search').val(selected_search_result);
        selected_search_result = '';
        $( this ).removeClass( &quot;ui-corner-top&quot; ).addClass( &quot;ui-corner-all&quot; );
      }
    }).autocomplete( &quot;instance&quot; )._renderItem = function(ul, item){
          output = &quot;&lt;li class='&quot; + item.class + &quot;'>&quot;;
          output += &quot;&lt;a class='&quot;+ item.class + &quot;'>&quot; + item.label + &quot;&lt;br>&lt;/a>&quot;;
          return $(output).appendTo(ul);
    };
    $('#map-search').on('focus', function(){$(this).autocomplete('search');});
    $('#map-search').keypress(function(e) {
        var code = (e.keyCode ? e.keyCode : e.which);
        if(code == 13) { //Enter keycode
            e.preventDefault();
        }
    });
    $('#map-search').focus();
};

$('#reset-search').trigger('click')



       
        Reset All
        Save View
        Resume View
      
      DataPointclouds Elevation Models DSM: Low Resolution... DSM: Med Resolution... DTM: Low Resolution... DTED0 (1000m) Imagery Vectors Meshes FG3D Data Reference Boundaries
      AOI List
      Cerro Chaparro  Cerro Chaparro (Copy)  Kensington Park  North Coronado  USGS 1  USMC GEOFidelis 2  Vista Grande Elementary School  
      Loading Layers 
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;layertree-body-container&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='layertree-body-container']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='layertree-container']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Tinted Hillshade'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Scanned Maps'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[6]/div</value>
   </webElementXpaths>
</WebElementEntity>
