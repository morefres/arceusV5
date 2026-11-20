.class public Lug/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lug/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lug/j;

    new-instance v1, Lug/j$d;

    invoke-direct {v1}, Lug/j$d;-><init>()V

    new-instance v2, Lek/d0;

    invoke-direct {v2}, Lek/d0;-><init>()V

    invoke-direct {v0, v1, v2}, Lug/j;-><init>(Lug/j$c;Lek/c0;)V

    sput-object v0, Lug/j$b;->a:Lug/j;

    return-void
.end method

.method public static bridge synthetic a()Lug/j;
    .locals 1

    sget-object v0, Lug/j$b;->a:Lug/j;

    return-object v0
.end method
