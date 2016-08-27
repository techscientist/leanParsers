import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String end_time;
	public String name;
	public String state;
	public String description;
	public String privacy;
	public String topic;
	public String timezone;
	public String organizer_description;
	public String background_image;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public String email;
	public String organizer_name;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String type;
	public String location_name;
	public int id;

	public RootModel(VersionModel version, String end_time, String name, String state, String description, String privacy, String topic, String timezone, String organizer_description, String background_image, String code_of_conduct, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, String email, String organizer_name, CopyrightModel copyright, CreatorModel creator, String type, String location_name, int id) {

		this._version = version;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.email = email;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._creator = creator;
		this.type = type;
		this.location_name = location_name;
		this.id = id;

	}

}