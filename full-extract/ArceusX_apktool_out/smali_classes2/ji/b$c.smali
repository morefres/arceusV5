.class public Lji/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lji/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lji/b;

    invoke-direct {v0}, Lji/b;-><init>()V

    sput-object v0, Lji/b$c;->a:Lji/b;

    return-void
.end method

.method public static bridge synthetic a()Lji/b;
    .locals 1

    sget-object v0, Lji/b$c;->a:Lji/b;

    return-object v0
.end method
