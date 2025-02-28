package com.samsong.reward;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestCustomerDataProvider {
    static String getFirstCustomerEvent(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO: BUG: need to close resources or use try-with-resource
//        finally {
//            br.close();
//            fr.close();
//        }
    }

    static String getCustomerEvents(String path)  {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            // TODO code smell: catch and ignore an exception
//             throw new RuntimeException(e);
        }
        return null;
    }
}
