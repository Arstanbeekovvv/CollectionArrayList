package HomeWorkLMS.MethodsAndModels;

import HomeWorkLMS.Models.Library;

import java.util.List;

public interface LibraryService {
    void saveLibrary(Library libraries);

    void getAllLibraries();

    Library getLibraryById(Long id);

    void updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);
}
