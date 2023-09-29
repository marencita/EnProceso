pipeline {
  agent any

  stages {

 stage("paso 1"){
     
      steps {
          script {			
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

