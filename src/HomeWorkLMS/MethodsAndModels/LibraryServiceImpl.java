package HomeWorkLMS.MethodsAndModels;

import HomeWorkLMS.Db.DateBase;
import HomeWorkLMS.Models.Library;

import java.util.List;

public class LibraryServiceImpl implements LibraryService{
    @Override
    public void saveLibrary(Library libraries) {
        DateBase.libraries.add(libraries);
    }

    @Override
    public void getAllLibraries() {
        for (Library library : DateBase.libraries) {
            System.out.println(library);
        }
    }

    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == id){
                return DateBase.libraries.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateLibrary(Long id, Library library) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == id){
                DateBase.libraries.set(i, library);
                System.out.println("Successful update library ✅");
            }
        }
    }

    @Override
    public String deleteLibrary(Long id) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == id){
                DateBase.libraries.remove(i);
                System.out.println("Successful update library ✅");
            }
        }
        return "Not found library !!!";
    }
}
