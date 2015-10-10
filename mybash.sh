while read -e ABC; do
	if [[ "$ABC" =~ \|(.*)\|(.*)\|$ ]]; 
	then 
  		echo "\$(\"[name=${BASH_REMATCH[2]}]\").val(\"${BASH_REMATCH[1]}\");" ;
	fi
done

