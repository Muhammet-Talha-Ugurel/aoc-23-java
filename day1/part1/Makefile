# Variables
JAVAC = javac
JAVA = java
MAIN_CLASS = Main
SRC_DIR = src
BIN_DIR = bin

# Source files
SOURCES = $(wildcard $(SRC_DIR)/*.java)

# Default target
all: $(BIN_DIR)/$(MAIN_CLASS).class

# Compile Java source files
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# Clean up
clean:
	rm -rf $(BIN_DIR)

# Run the application
run: $(BIN_DIR)/src/$(MAIN_CLASS).class
	@$(JAVA) -cp $(BIN_DIR) src.Main 

.PHONY: all clean run
