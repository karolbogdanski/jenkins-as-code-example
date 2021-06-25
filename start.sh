docker run --name jenkins --rm -p 8080:8080 -p 50000:50000 -d \
-v /var/run/docker.sock:/var/run/docker.sock \
--env JENKINS_ADMIN_ID=admin  --env JENKINS_ADMIN_PASSWORD=password \
jenkins:jcasc
