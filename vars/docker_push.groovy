def call(String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsID: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
