#! /bin/sh

filelist=""
for soyfile in src/net/arunjitsingh/gsgae/example/templates/*.soy; do
  filelist="$filelist,$soyfile"
done
filelist=${filelist/,/}

java -jar bin/SoyParseInfoGenerator.jar \
--outputDirectory src/net/arunjitsingh/gsgae/example/soy \
--javaPackage net.arunjitsingh.gsgae.example.soy \
  --javaClassNameSource filename \
  --srcs $filelist
