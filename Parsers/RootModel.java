import java.util.ArrayList;

class RootModel {

	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String background_image;
	public String timezone;
	public String end_time;
	public String topic;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String start_time;
	public String email;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public int id;
	public VersionModel _version;
	public String name;
	public String organizer_name;
	public String privacy;
	public String type;
	public String schedule_published_on;

	public RootModel(String logo, String organizer_description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String state, String background_image, String timezone, String end_time, String topic, CopyrightModel copyright, CreatorModel creator, String start_time, String email, String code_of_conduct, String description, String location_name, int id, VersionModel version, String name, String organizer_name, String privacy, String type, String schedule_published_on) {

		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;
		this._copyright = copyright;
		this._creator = creator;
		this.start_time = start_time;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this.id = id;
		this._version = version;
		this.name = name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}