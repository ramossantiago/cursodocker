FROM nginx

RUN apt update && apt install vim -y

RUN useradd userapp --no-create-home --no-user-group

#USER userapp

#LABEL 'Imagen nginx con vim'

WORKDIR /usr/share/nginx/html/

COPY index.html .



