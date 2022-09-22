def call(String workspace, String publishDir){
	node{
	    dotnetPublish project: workspace, 
            	outputDirectory: publishDir, 
	        sdk: '.NET 6', 
	        configuration: 'Release', 
	        selfContained: false
	}
}
