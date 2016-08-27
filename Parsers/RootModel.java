import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String description;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String topic;
	public String timezone;
	public String organizer_name;
	public String schedule_published_on;
	public String name;
	public int id;
	public String privacy;
	public String start_time;
	public String state;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_description;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String description, String email, String location_name, Call_for_papersModel call_for_papers, String end_time, String topic, String timezone, String organizer_name, String schedule_published_on, String name, int id, String privacy, String start_time, String state, String logo, ArrayList<Social_linksModel> social_links, String background_image, String organizer_description, String code_of_conduct, String type, CopyrightModel copyright, VersionModel version) {

		this._creator = creator;
		this.description = description;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.id = id;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;
		this.logo = logo;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this._version = version;

	}

}