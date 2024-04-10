// SIDEBAR TOGGLE

let sidebarOpen = false;
const sidebar = document.getElementById("sidebar");

function openSidebar() {
  if (!sidebarOpen) {
    sidebar.classList.add("sidebar-responsive");
    sidebarOpen = true;
  }
}

function closeSidebar() {
  if (sidebarOpen) {
    sidebar.classList.remove("sidebar-responsive");
    sidebarOpen = false;
  }
}

// ----------drop down code is herer--------------
document.addEventListener("DOMContentLoaded", function () {
  var dropdowns = document.querySelectorAll(".dropdown-toggle");

  dropdowns.forEach(function (dropdown) {
    dropdown.addEventListener("click", function (event) {
      event.stopPropagation(); // Prevent closing sidebar when clicking on the dropdown
      var dropdownMenu = this.querySelector(".dropdown-menu");
      dropdownMenu.classList.toggle("show");
    });

    document.addEventListener("click", function (event) {
      dropdowns.forEach(function (dropdown) {
        var dropdownMenu = dropdown.querySelector(".dropdown-menu");
        if (
          dropdownMenu.classList.contains("show") &&
          !dropdown.contains(event.target)
        ) {
          dropdownMenu.classList.remove("show");
        }
      });
    });
  });
});
