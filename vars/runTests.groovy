def call(String workspace, string resultsDir){
	node{
	    dotnetTest project: workspace, 
	        resultsDirectory: resultsDir, 
	        sdk: '.NET 6', 
	        configuration: 'Release' 
	}
}
