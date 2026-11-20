.class public Lci/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lci/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lei/a;[Lci/c$a;Lci/l;)Lci/e;
    .locals 6

    new-instance v0, Lci/e;

    invoke-static {p2}, Lek/n;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lrg/a1;->S()Ljava/lang/String;

    move-result-object v3

    move-object v1, p1

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lci/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lci/l;[Lci/c$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;[Lci/c$a;Lci/l;)Lci/d;
    .locals 1

    new-instance v0, Lci/d;

    invoke-direct {v0, p1, p3, p2}, Lci/d;-><init>(Ljava/lang/String;Lci/l;[Lci/c$a;)V

    return-object v0
.end method
