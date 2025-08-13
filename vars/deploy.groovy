def call(String username){
    sh "sed -i 's|<dockerhub-username>|${username}|g' docker-compose.yml"
    sh "docker compose up -d"
}
