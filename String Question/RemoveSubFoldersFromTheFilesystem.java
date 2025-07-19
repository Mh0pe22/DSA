import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersFromTheFilesystem {
    public static void main(String[] args) {
        String[] folders = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(removeSubFolder(folders));
    }

    public static List<String> removeSubFolder(String[] folders){
        Arrays.sort(folders);

        List<String> ans = new ArrayList<>();
        ans.add(folders[0]);

        for (int i = 1; i < folders.length; i++) {
            String currFolder = folders[i];
            String lastFolder = ans.get(ans.size() - 1);
            lastFolder += "/";

            if(!currFolder.startsWith(lastFolder)){
                ans.add(currFolder);
            }
        }

        return ans;
    }
}
