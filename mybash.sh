while read -e ABC; do
	if [[ "$ABC" =~ \|(.*)\|(.*)\|$ ]]; 
	then 
  		echo "registered.put(\"${BASH_REMATCH[2]}\", \"${BASH_REMATCH[1]}\");" ;
	fi
done

