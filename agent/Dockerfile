FROM jenkins/agent:latest
USER root
RUN apt-get update && apt-get install -y apt-transport-https \
       ca-certificates curl gnupg2 \
       software-properties-common 

RUN apt-get install -y xdg-utils

RUN usermod -aG root jenkins
USER jenkins 