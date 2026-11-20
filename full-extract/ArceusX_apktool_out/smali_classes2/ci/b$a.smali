.class public Lci/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lci/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lci/b;

    invoke-direct {v0}, Lci/b;-><init>()V

    sput-object v0, Lci/b$a;->a:Lci/b;

    return-void
.end method

.method public static bridge synthetic a()Lci/b;
    .locals 1

    sget-object v0, Lci/b$a;->a:Lci/b;

    return-object v0
.end method
