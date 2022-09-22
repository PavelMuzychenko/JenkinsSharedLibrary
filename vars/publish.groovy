def call(String workspace, string publishDir){
	node{
	    dotnetPublish project: workspace, 
            outputDirectory: publishDir, 
	        sdk: '.NET 6', 
	        configuration: 'Release', 
	        selfContained: false
	}
}
