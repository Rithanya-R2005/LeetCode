bool rotateString(char* s, char* goal) {
    int r=1;
    int n=strlen(s);
    if(n!=strlen(goal)){
        return false;
    }
    if(strcmp(goal,s)==0){
        return true;
    }
    while(r<n){
        char temp[n+1];
        for(int i=0;i<n;i++){
            temp[(i+r)%n]=s[i];
        }
        temp[n]='\0'; //Imp note it
        if(strcmp(temp,goal)==0){
            return true;
        }
        r++;
    }
    return false;
}