import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String location_name;
	public String start_time;
	public String schedule_published_on;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public int id;
	public String code_of_conduct;
	public String description;
	public String organizer_name;
	public String name;
	public String logo;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String timezone;
	public String type;

	public RootModel(CreatorModel creator, String organizer_description, ArrayList<Social_linksModel> social_links, String state, String location_name, String start_time, String schedule_published_on, String topic, Call_for_papersModel call_for_papers, String end_time, int id, String code_of_conduct, String description, String organizer_name, String name, String logo, String email, VersionModel version, CopyrightModel copyright, String background_image, String privacy, String timezone, String type) {

		this._creator = creator;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this.location_name = location_name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.logo = logo;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;

	}

}