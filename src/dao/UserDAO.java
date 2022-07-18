package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import beans.User;

public class UserDAO {

    private Map<String, User> users = new HashMap<>();

    public UserDAO(String contextPath){
        readUsers(contextPath);
    }

    public void readUsers(String path) {
        BufferedReader in = null;
        try {
            File file = new File(path + "/data/users.json");
            in = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }
            ObjectMapper mapper = new ObjectMapper();
            this.users = mapper.readValue(stringBuilder.toString(), new TypeReference<Map<String, User>>(){});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {}
            }
        }
    }
}
