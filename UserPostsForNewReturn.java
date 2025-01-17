class Type
{
    String savedVal;

    String Type()
    {
        return "Called";
    }

    void Type(String typeName)
    {
        savedVal = typeName;
    }

    public static void main(String[] args) {

    }
}

class Req
{
    String Req()
    {
        return "Requested";
    }

    String Req(int reqID)
    {
        return "Requested";
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
    void Ret(String retDefn) { info = retDefn; }
    public static void main(String[] args) {
        updateGetInfo();
    }
}

class UserPostsForNewReturn
{
    public static void main(String[] args) 
    {
        Type vType = new Type("Crazy!");
    //    Integer<T> ter_num;
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