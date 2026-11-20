.class public Lek/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lek/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lek/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lek/c;

    invoke-direct {v0}, Lek/c;-><init>()V

    sput-object v0, Lek/c$a;->a:Lek/c;

    return-void
.end method

.method public static bridge synthetic a()Lek/c;
    .locals 1

    sget-object v0, Lek/c$a;->a:Lek/c;

    return-object v0
.end method
