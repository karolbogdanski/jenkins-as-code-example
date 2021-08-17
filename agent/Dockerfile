FROM jenkins/agent:latest-jdk11
USER root
RUN apt-get update && apt-get install -y apt-transport-https \
       ca-certificates curl gnupg2 \
       software-properties-common  \
       bash

CMD [ "/bin/bash" ]