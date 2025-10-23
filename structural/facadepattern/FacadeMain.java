import structural.facadepattern.components.HomeTheaterFacade;

void main() {

    HomeTheaterFacade homeTheater = new HomeTheaterFacade();

    homeTheater.filmStarten("Inception");

    homeTheater.filmBeenden();
}
