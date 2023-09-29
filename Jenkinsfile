pipeline {
  agent any

  stages {
	
	stage('ejecucion'){
     
      steps {
          script {	
           sh "gradle test aggregate --no-build-cache"
        }
      }
    }
  }
  post {
      always {          
          deleteDir()
           sh "echo 'fase always'"
      }
      success {
            sh "echo 'fase success'"
        }

      failure {
            sh "echo 'fase failure'"
      }
      
  }
}  

