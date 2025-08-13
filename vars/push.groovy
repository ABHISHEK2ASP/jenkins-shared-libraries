def call(String docker_username, String github_repo){
  sh "docker push ${docker_username}/${github_repo}"
}
