FROM jenkins/agent:latest
USER root
RUN apt-get update && apt-get install -y apt-transport-https \
       ca-certificates curl gnupg2 \
       software-properties-common 

RUN apt-get install -y xdg-utils

RUN apt-get install -yq nodejs build-essential
RUN apt-get install -y npm
RUN npm install npm@latest -g

RUN usermod -aG root jenkins
USER jenkins 