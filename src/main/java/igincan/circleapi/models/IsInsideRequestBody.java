package igincan.circleapi.models;

import igincan.circleapi.classes.Circle;
import igincan.circleapi.classes.Point;

public record IsInsideRequestBody(Circle circle, Point point) {}
