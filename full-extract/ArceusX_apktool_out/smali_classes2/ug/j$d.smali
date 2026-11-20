.class public Lug/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lug/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lci/m;Ljava/lang/String;)Lci/r;
    .locals 1

    new-instance v0, Lci/r;

    invoke-direct {v0, p1, p2, p3, p4}, Lci/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lci/m;Ljava/lang/String;)V

    return-object v0
.end method
