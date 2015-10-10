while read -e ABC; do
	if [[ "$ABC" =~ \|.*\|(.*)\|$ ]]; 
	then 
  		echo "${BASH_REMATCH[1]}: \"\"," ;
	fi
done

