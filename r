tag=openpf
ip=$(ifconfig | grep inet | grep netmask | grep -v 127.0.0.1 | awk '{print $2}' | head -1)
echo $ip
docker run -v $(pwd):/home/normaluser/workspace -it --net=host \
            -e DISPLAY=$ip:0 \
            -v /tmp/.X11-unix:/tmp/.X11-unix \
            $tag
