class Type
{
    String savedVal;

    String Type()
    {
        return "Called";
    }

    Type(String typeName)
    {
        savedVal = typeName;
    }

    public static void main(String[] args) {
        
    }
}

class Req
{
    int requestID = 0;

    String Req()
    {
        return "Requested";
    }

    Req(int reqID)
    {
        requestID = reqID;
    }

    public static void main(String[] args) 
    {
        
    }
}

class Ret
{
    static String getInfo = "Okay";
    static String info = "new";
    static void updateGetInfo() { getInfo = getInfo + info; }
    Ret(String retDefn) { info = retDefn; }
    public static void main(String[] args) {
        updateGetInfo();
    }
}

class UserPostsForNewReturn
{
    public static void main(String[] args) 
    {
        Type vype = new Type("Crazy!");
    //    Integer<T> ter_num;
        System.out.println(getPostRequest());
        System.out.println(getReturn());
        System.out.println(vype);
        System.out.println(getUsers());
    }

    
    static Req getPostRequest()
    {
        System.out.println("Enter request info.: ");
        String req_info = System.console().readLine();
        Req id = new Req(58);
        return id;
    }

    static Ret getReturn()
    {
        return new Ret("ReturnValue");
    }

    static String getUsers()
    {
        return "Users list.";
    }
}