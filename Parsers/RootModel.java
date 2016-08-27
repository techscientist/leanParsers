import java.util.ArrayList;

class RootModel {

	public String topic;
	public String type;
	public String privacy;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public String state;
	public String organizer_name;
	public String background_image;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String start_time;
	public int id;
	public String name;
	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public String schedule_published_on;

	public RootModel(String topic, String type, String privacy, String email, String description, Call_for_papersModel call_for_papers, String code_of_conduct, String timezone, String end_time, CopyrightModel copyright, String state, String organizer_name, String background_image, VersionModel version, ArrayList<Social_linksModel> social_links, String logo, String start_time, int id, String name, String organizer_description, String location_name, CreatorModel creator, String schedule_published_on) {

		this.topic = topic;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this.state = state;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._version = version;
		this.social_links = social_links;
		this.logo = logo;
		this.start_time = start_time;
		this.id = id;
		this.name = name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;

	}

}