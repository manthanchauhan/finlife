SPRING_PATH=/Users/manthan/finlife
REACT_PATH=/Users/manthan/finlife-react


cd $SPRING_PATH || exit
mvn install

/usr/local/bin/docker build -t finlife-spring $SPRING_PATH
/usr/local/bin/docker build -t finlife-react $REACT_PATH
/usr/local/bin/docker-compose -f $SPRING_PATH/docker-compose.yml up -d
