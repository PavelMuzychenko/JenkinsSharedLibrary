def call(String workspace, String resultsDir){
	node{
	    dotnetTest project: workspace, 
	        resultsDirectory: resultsDir, 
	        sdk: '.NET 6', 
	        configuration: 'Release' 
	}
}
