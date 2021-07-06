x=$(expr $(( $RANDOM % 3 + 1 )) \* 100)
y=$(expr $(( $RANDOM % 3 )) \* 10)
z=$(( $RANDOM % 10 ))

rand=$(expr $x + $y + $z )
echo $rand

response=$(curl -I http://httpstat.us/$rand 2>/dev/null | head -n 1 | cut -d$' ' -f2)

if [ $response -ge 400 ]
then
    exit -1
fi

exit 0
