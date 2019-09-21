package BudgetBuddi.Domain.Users;

public class User
{
    //Variables
    private String userName;
    private String email;
    private String name;
    private String password;

    public User(Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
        this.name = builder.name;
        this.password = builder.password;
    }//closes constructor

    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }


    public String getPassword() {
        return password;
    }

    public static class Builder
    {
        private String userName;
        private String email;
        private String name;
        private String password;

        public Builder userName(String userName)
        {
            this.userName=userName;
            return this;
        }

        public Builder email(String email)
        {
            this.email=email;
            return this;
        }

        public Builder name(String name)
        {
            this.name=name;
            return this;
        }

        public Builder password(String password)
        {
            this.password=password;
            return this;
        }

        public User build()
        {
            return new User(this);
        }


    }//builder

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}//closes class
