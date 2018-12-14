<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_.fotorama1544788027344 .fo</name>
   <tag></tag>
   <elementGuidId>863d12ba-62d3-452d-a518-62121dfc3b4b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>product-content__wrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
.fotorama1544788027344 .fotorama__nav--thumbs .fotorama__nav__frame{
padding:2px;
height:90px}
.fotorama1544788027344 .fotorama__thumb-border{
height:90px;
border-width:2px;
margin-top:2px}
    
    
        
            
                
            
            
            
            
                
            
            
            
            
            
        
            
                
                
                    
                
                
                    
                
    
    

    
    

                
                    
                
            
        
        
    
    





    var config = {
            &quot;width&quot;: 700,
            &quot;thumbheight&quot;: 90,
            &quot;navtype&quot;: &quot;thumbs&quot;,
            &quot;height&quot;: 700        },
        thumbBarHeight = 0,
        loader = document.querySelectorAll('[data-gallery-role=&quot;gallery-placeholder&quot;] [data-role=&quot;loader&quot;]')[0];

    if (config.navtype === 'horizontal') {
        thumbBarHeight = config.thumbheight;
    }

    loader.style.paddingBottom = ( config.height / config.width * 100) + &quot;%&quot;;




    
        LG HOME THEATRE - 1000WATTS- LHD657    
    
Sold by

Leviticus Electronics



            
            SKU        
        
        LEVITICUS-LHD657    


            
            In stock
        
    

            
            Brief Description        
        
        
Brand: LG
5.1 Channel Home Theatre System
Model Number: LG LHD657
Color: Black
Warranty: 1 Year
    


    
        


            Special Price
        Price
    KES35,499.00
                
    
    
    
        


        Price
    KES36,999.00
        
    


Buy Online
          


    
        
        
        
                                    
    
        
                            
                    
                        
                    
                
                        
                
                    Add to Cart
                
                
    
        
            ...        
    

        
    require([
        'jquery',
        'prcr',
        'domReady!'
    ], function($, timers) {
        'use strict';
                $.each([&quot;42396&quot;], function(key, id) {
            timers.addProductIdToRequest(id);
        });
            });
    
                
        
    

    
        
                    


    require([
        'jquery',
        'priceBox'
    ], function($){
        var dataPriceBoxSelector = '[data-role=priceBox]',
            dataProductIdSelector = '[data-product-id=42396]',
            priceBoxes = $(dataPriceBoxSelector + dataProductIdSelector);

        priceBoxes = priceBoxes.filter(function(index, elem){
            return !$(elem).find('.price-from').length;
        });

        priceBoxes.priceBox({'priceConfig': {&quot;productId&quot;:&quot;42396&quot;,&quot;priceFormat&quot;:{&quot;pattern&quot;:&quot;KES%s&quot;,&quot;precision&quot;:2,&quot;requiredPrecision&quot;:2,&quot;decimalSymbol&quot;:&quot;.&quot;,&quot;groupSymbol&quot;:&quot;,&quot;,&quot;groupLength&quot;:3,&quot;integerRequired&quot;:1}}});
    });


    



    Share this Product



  AddThis Sharing ButtonsShare to WhatsAppWhatsAppShare to FacebookFacebookShare to TwitterTwitter
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontent&quot;)/div[@class=&quot;columns&quot;]/div[@class=&quot;column main&quot;]/div[@class=&quot;product-content__wrapper&quot;]</value>
   </webElementProperties>
</WebElementEntity>
