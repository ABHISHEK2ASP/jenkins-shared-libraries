def call(String docker_username, String github_repo){
    sh "docker pull ${docker_username}/${github_repo}"
}
