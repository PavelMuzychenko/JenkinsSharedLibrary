def call(String recipient){
	node{
	    emailext subject: 'Build ${JOB_NAME} ${BUILD_NUMBER} has been finished ', 
            	body: 'Please go to ${BUILD_URL} and check',
            	to: recipient, 
            	attachLog: true,
            	compressLog: true
	}
}
