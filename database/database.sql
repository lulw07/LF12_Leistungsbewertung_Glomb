CREATE TABLE Schueler (
  schueler_id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  spielgeld INTEGER NOT NULL
);

CREATE TABLE Lehrer (
    lehrer_id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL
);

CREATE TABLE Leistungsbewertung (
    leistungsbewertung_id INTEGER PRIMARY KEY AUTOINCREMENT,
    lehrer_id INTEGER,
    FOREIGN KEY (lehrer_id) REFERENCES Lehrer(lehrer_id)
);

CREATE TABLE Leistungsbewertung_Schueler (
     leistungsbewertung_id INTEGER,
     schueler_id INTEGER,
     PRIMARY KEY (leistungsbewertung_id, schueler_id),
     FOREIGN KEY (leistungsbewertung_id) REFERENCES Leistungsbewertung(leistungsbewertung_id),
     FOREIGN KEY (schueler_id) REFERENCES Schueler(schueler_id)
);

CREATE TABLE Report (
    report_id INTEGER PRIMARY KEY AUTOINCREMENT,
    lehrer_id INTEGER,
    FOREIGN KEY (lehrer_id) REFERENCES Lehrer(lehrer_id)
);

CREATE TABLE Report_Schueler (
     report_id INTEGER,
     schueler_id INTEGER,
     bericht TEXT,
     PRIMARY KEY (report_id, schueler_id),
     FOREIGN KEY (report_id) REFERENCES Report(report_id),
     FOREIGN KEY (schueler_id) REFERENCES Schueler(schueler_id)
);
