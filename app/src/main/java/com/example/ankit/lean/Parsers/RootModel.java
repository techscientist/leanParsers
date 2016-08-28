import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String email;
	public String type;
	public String name;
	public String schedule_published_on;
	public String description;
	public String topic;
	public CreatorModel _creator;
	public String end_time;
	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String privacy;
	public String start_time;
	public String location_name;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public String background_image;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, String email, String type, String name, String schedule_published_on, String description, String topic, CreatorModel creator, String end_time, String logo, String organizer_description, Call_for_papersModel call_for_papers, String timezone, ArrayList<Social_linksModel> social_links, String state, String privacy, String start_time, String location_name, VersionModel version, String organizer_name, int id, String background_image, String code_of_conduct) {

		this._copyright = copyright;
		this.email = email;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.topic = topic;
		this._creator = creator;
		this.end_time = end_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.social_links = social_links;
		this.state = state;
		this.privacy = privacy;
		this.start_time = start_time;
		this.location_name = location_name;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;

	}

}