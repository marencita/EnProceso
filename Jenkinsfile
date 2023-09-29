pipeline {
  agent any

  stages {
	stage('Git Clone') {
            steps {
				git clone https://github.com/marencita/SumaDosNumeros.git
            }
        }
 stage('ejecucion'){
     
      steps {
          script {	
		   cd SumaDosNumeros
           gradle test aggregate --no-build-cache
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

