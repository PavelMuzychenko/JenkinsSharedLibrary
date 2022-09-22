def call(String workspace){
    node{
        dotnetBuild project: workspace,
 	          sdk: '.NET 6', 
 	          configuration: 'Release'  
    }
}
